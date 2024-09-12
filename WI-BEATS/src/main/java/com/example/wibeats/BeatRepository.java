package com.example.wibeats;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeatRepository extends JpaRepository<Beat, UUID> {
}
