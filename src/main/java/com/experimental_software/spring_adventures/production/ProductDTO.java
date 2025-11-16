package com.experimental_software.spring_adventures.production;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public record ProductDTO(
    @Schema(example = "2")
    @JsonProperty("_id")
    int id,

    @Schema(example = "Bearing Ball")
    String name) {
}
