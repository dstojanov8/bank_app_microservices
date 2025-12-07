package com.eazybytes.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // ACCOUNTS_MS (Microservice) will be used as a value to populate createdBy and updatedBy.
        // Oce we implement security this value will ve changed until then we will hardcode it.
        return Optional.of("ACCOUNTS_MS");
    }
}
