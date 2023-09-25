package com.example.stockmarketapp.domain.model

import org.threeten.bp.LocalDateTime


data class IntradayInfo(
    val date: LocalDateTime,
    val close: Double
)