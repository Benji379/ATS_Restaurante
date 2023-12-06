package com.modelo.action;

import com.boleta.model.AddressDetails;
import com.boleta.model.HeaderDetails;
import com.boleta.model.Product;
import com.boleta.model.ProductTableHeader;
import com.boleta.service.PdfInvoiceCreator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class GeneradorFacturaPDF {

    public static void generarPDF(String codigoFactura, String empleado, String cliente, String emailCliente, List<Product> listaProductos, String fecha) {
        try {
            String pdfName = codigoFactura + "_" + fecha + ".pdf";
            String direccionDescarga = CustomFileChooser.FileChosserArchivo(pdfName, "pdf", "Factura");

            if (direccionDescarga != null) {

                PdfInvoiceCreator cepdf = new PdfInvoiceCreator(direccionDescarga);
                cepdf.createDocument();

                //Create Header start
                HeaderDetails header = new HeaderDetails();
                header.setInvoiceNo(codigoFactura).setInvoiceDate(fecha).build();
                cepdf.createHeader(header);
                //Header End

                //Create Address start
                AddressDetails addressDetails = new AddressDetails();
                addressDetails
                        .setBillingCompany("Ats_Resturante")
                        .setBillingName(empleado)
                        .setBillingAddress("Mz ww lt 21 Los Olivos")
                        .setBillingEmail("improats@gmail.com")
                        .setShippingName(cliente)
                        .setShippingAddress(emailCliente)
                        .build();

                cepdf.createAddress(addressDetails);
                //Address end

                //Product Start
                ProductTableHeader productTableHeader = new ProductTableHeader();
                cepdf.createTableHeader(productTableHeader);
                listaProductos = cepdf.modifyProductList(listaProductos);
                cepdf.createProduct(listaProductos);
                //Product End

                //Term and Condition Start
                List<String> TncList = new ArrayList<>();
                TncList.add("- Nos esforzamos por ofrecer alimentos frescos y de alta calidad. Si hay algún problema con la calidad de la comida, por favor, informe al personal de inmediato para que podamos abordar la situación.");
                String imagePath = "";
                cepdf.createTnc(TncList, false, imagePath);
                // Term and condition end
                Action.mensaje("Factura " + pdfName + " descargada");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static String EnviarCorreoPdf(String codigoFactura, String empleado, String cliente, String emailCliente, List<Product> listaProductos, String fecha) {
        try {
            String pdfName = codigoFactura + "_" + fecha + ".pdf";
            String direccionDescarga = "data/pdf/" + pdfName;

            if (direccionDescarga != null) {

                PdfInvoiceCreator cepdf = new PdfInvoiceCreator(direccionDescarga);
                cepdf.createDocument();

                //Create Header start
                HeaderDetails header = new HeaderDetails();
                header.setInvoiceNo(codigoFactura).setInvoiceDate(fecha).build();
                cepdf.createHeader(header);
                //Header End

                //Create Address start
                AddressDetails addressDetails = new AddressDetails();
                addressDetails
                        .setBillingCompany("Ats_Resturante")
                        .setBillingName(empleado)
                        .setBillingAddress("Mz ww lt 21 Los Olivos")
                        .setBillingEmail("improats@gmail.com")
                        .setShippingName(cliente)
                        .setShippingAddress(emailCliente)
                        .build();

                cepdf.createAddress(addressDetails);
                //Address end

                //Product Start
                ProductTableHeader productTableHeader = new ProductTableHeader();
                cepdf.createTableHeader(productTableHeader);
                listaProductos = cepdf.modifyProductList(listaProductos);
                cepdf.createProduct(listaProductos);
                //Product End

                //Term and Condition Start
                List<String> TncList = new ArrayList<>();
                TncList.add("- Nos esforzamos por ofrecer alimentos frescos y de alta calidad. Si hay algún problema con la calidad de la comida, por favor, informe al personal de inmediato para que podamos abordar la situación.");
                String imagePath = "";
                cepdf.createTnc(TncList, false, imagePath);
                // Term and condition end
                CorreoUtils.enviarCorreo("improats@gmail.com", "esilqzqruexyzpxy", emailCliente, "Factura " + codigoFactura, "Envio de factura electronica " + fecha, direccionDescarga);
                return direccionDescarga;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}
