//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//
//
//
//    @Autowired
//    private InvoiceDao invoiceDao;
//    private static final String NUMBER = "FV/2024";
//
//    @Test
//    void testInvoiceDaoSave() {
//        //Given
//        Item item1 = new Item(new BigDecimal(2000), 10, new BigDecimal(20000));
//        Item item2 = new Item(new BigDecimal(1500), 10, new BigDecimal(15000));
//        Item item3 = new Item(new BigDecimal(2500), 10, new BigDecimal(25000));
//        Invoice invoice = new Invoice(NUMBER);
//        invoice.getItemsI().add(item1);
//        invoice.getItemsI().add(item2);
//        invoice.getItemsI().add(item3);
//        item1.setInvoice(invoice);
//        item2.setInvoice(invoice);
//        item3.setInvoice(invoice);
//
//
//        //When
//        invoiceDao.save(invoice);
//        int id = invoice.getId();
//
//        //Then
//        assertNotEquals(0, id);
//
//        //CleanUp
//        invoiceDao.deleteById(id);
//
//    }
//
//}
