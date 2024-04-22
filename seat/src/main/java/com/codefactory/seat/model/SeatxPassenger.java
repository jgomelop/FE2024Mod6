package com.codefactory.seat.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="SeatPassenger")
public class SeatxPassenger {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "SEAT_PASSENGER_SEQ", allocationSize = 1)
    Long id;
}