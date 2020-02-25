package com.example.SpringDataJpa.AuditUserExample;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
    	Optional<String> name=  Optional.of("guru");
    	return name;
    }
}