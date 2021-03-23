package com.account.repository;

import com.account.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {

   Optional<Invoice> findByInvoiceNo(String invoiceNumber);


}
