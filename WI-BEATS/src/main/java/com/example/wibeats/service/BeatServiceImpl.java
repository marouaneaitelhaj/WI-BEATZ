package com.example.wibeats.service;

import com.example.wibeats.BeatRepository;
import com.example.wibeats.dtoS.BeatReq;
import com.example.wibeats.dtoS.BeatRsp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BeatServiceImpl implements BeatService {
    private final BeatRepository beatRepository;
    @Override
    public BeatRsp save(BeatReq beatReq) {
        return null;
    }

    @Override
    public BeatRsp update(BeatReq beatReq, UUID uuid) {
        return null;
    }

    @Override
    public Boolean delete(UUID uuid) {
        return null;
    }

    @Override
    public BeatRsp findById(UUID uuid) {
        return null;
    }

    @Override
    public List<BeatRsp> findAll() {
        return List.of();
    }
}
