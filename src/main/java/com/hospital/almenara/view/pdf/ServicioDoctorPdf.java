package com.hospital.almenara.view.pdf;

import com.hospital.almenara.entity.AnioAcademicoDelegado;
import com.hospital.almenara.entity.ServicioDelegado;
import com.hospital.almenara.entity.ServicioDoctor;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ServicioDoctorPdf {

    private static final Logger logger = LoggerFactory.getLogger(DoctorPdf.class);

    private static final Color DARK_COLOR = new Color(0, 36, 51);
    private static final String FONT_FAMILY = FontFactory.HELVETICA;

    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    String date_now = formatter.format(new Date());

    public ByteArrayOutputStream getListDoctors(List<ServicioDoctor> servicioDoctorList) {

        // ORIENTATION HORIZONTAL: PageSize.A4.rotate()
        Document document = new Document(PageSize.A4.rotate(), 20, 20, 20, 20);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            PdfPTable table = new PdfPTable(17);
            table.setSpacingBefore(20);
            table.setWidthPercentage(100);
//            table.setWidths(new int[]{1, 3, 6, 6, 6, 6, 3, 3, 4, 10, 2, 6, 5});

            Font headFont = FontFactory.getFont(FONT_FAMILY, 14);
            headFont.setColor(new Color(255, 255, 255));
            PdfPCell hcell;

            hcell = new PdfPCell(new Phrase("#", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Residente", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("Especialidad", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setVerticalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("NIV", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("AÑO", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("JUL", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("AGO", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("SEP", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("OCT", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("NOV", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("DIC", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("ENE", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("FEB", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("MAR", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("ABR", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("MAY", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            hcell = new PdfPCell(new Phrase("JUN", headFont));
            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            hcell.setBackgroundColor(DARK_COLOR);
            table.addCell(hcell);

            Font cellFont = new Font();
            cellFont.setColor(DARK_COLOR);
            cellFont.setSize(12);

            for (ServicioDoctor servicioDoctor : servicioDoctorList) {

                PdfPCell cell;

                cell = new PdfPCell(new Phrase(servicioDoctor.getId().toString(), cellFont));
                cell.setVerticalAlignment(Element.ALIGN_CENTER);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setRowspan(3);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(servicioDoctor.getDoctor().getName() + " - " + servicioDoctor.getDoctor().getSchoolAgreement().getSchool().getName(), cellFont));
                cell.setVerticalAlignment(Element.ALIGN_CENTER);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setRowspan(3);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(servicioDoctor.getDoctor().getSpecialty().getName(), cellFont));
                cell.setVerticalAlignment(Element.ALIGN_CENTER);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setRowspan(3);
                table.addCell(cell);

                for (AnioAcademicoDelegado anioAcademico: servicioDoctor.getAnioAcademicoDelegados()) {
                    cell = new PdfPCell(new Phrase(anioAcademico.getAnioAcademico().getCodigo(), cellFont));
                    cell.setVerticalAlignment(Element.ALIGN_CENTER);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);

                    cell = new PdfPCell(new Phrase(anioAcademico.getAnioAcademico().getAnioInicio() + " - " + anioAcademico.getAnioAcademico().getAnioFinal(), cellFont));
                    cell.setVerticalAlignment(Element.ALIGN_CENTER);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);
                    for (ServicioDelegado servicioDelegado: anioAcademico.getServicioDelegados()) {
                        cell = new PdfPCell(new Phrase(servicioDelegado.getServicio().getName(), cellFont));
                        cell.setVerticalAlignment(Element.ALIGN_CENTER);
                        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                        cell.setBackgroundColor((servicioDelegado.getServicio().getId() == 1) ? new Color(146, 255, 250) : new Color(255, 255, 255));
                        table.addCell(cell);
                    }
                }
            }

            PdfWriter.getInstance(document, out);
            document.open();

            document.addTitle("SERVICIO MÉDICOS");

            Path pathPhoto = Paths.get("src/main/resources/static").resolve("logo_hospital.png").toAbsolutePath();
            Image photo = Image.getInstance(String.valueOf(pathPhoto));
            photo.scaleToFit(60, 60);

            Paragraph header = new Paragraph();
            header.add(new Chunk(photo, 0, -60));
            document.add(header);

            Paragraph header1 = new Paragraph("Hospital: Guillermo Almenara",
                    FontFactory.getFont(FONT_FAMILY, 10, DARK_COLOR));
            header1.setAlignment(Element.ALIGN_RIGHT);
            document.add(header1);


            Paragraph header2 = new Paragraph("Fecha: " + date_now,
                    FontFactory.getFont(FONT_FAMILY, 10, DARK_COLOR));
            header2.setAlignment(Element.ALIGN_RIGHT);
            document.add(header2);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);

            Paragraph title = new Paragraph("Reporte",
                    FontFactory.getFont(FONT_FAMILY, 25, Font.BOLD, DARK_COLOR));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            Paragraph subtitle = new Paragraph("Lista de Servicio por Médicos",
                    FontFactory.getFont(FONT_FAMILY, 15, Font.UNDERLINE, DARK_COLOR));
            subtitle.setAlignment(Element.ALIGN_CENTER);
            document.add(subtitle);

            document.add(table);

            PdfPTable tableFooter = new PdfPTable(1);
            tableFooter.setSpacingBefore(20);
            tableFooter.setWidthPercentage(100);

            document.add(tableFooter);

            document.close();
        } catch (DocumentException | IOException ex) {
            logger.error("Error occurred: ", ex);
        }
        return out;
    }
}
