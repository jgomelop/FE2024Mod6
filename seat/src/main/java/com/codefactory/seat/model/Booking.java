package com.codefactory.seat.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
    @SequenceGenerator(name = "SEQ", sequenceName = "BOOKING_SEQ", allocationSize = 1)
    Long id;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<Passenger> passengerList = new ArrayList<>();

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "id_flight")
    private Flight flight;
}
