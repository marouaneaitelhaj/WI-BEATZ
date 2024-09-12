package com.example.wibeats.service;

import com.example.wibeats.dtoS.BeatReq;
import com.example.wibeats.dtoS.BeatRsp;
import com.example.wibeats.service.global.BaseService;

import java.util.UUID;

public interface BeatService extends BaseService<BeatRsp, BeatReq, UUID> {
}
