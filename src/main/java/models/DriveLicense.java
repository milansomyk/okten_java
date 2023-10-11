package models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
public class DriveLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int series;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "driveLicense",fetch = FetchType.LAZY)
    @ToString.Exclude
    Owner owner;
    public DriveLicense(int series) {
        this.series = series;
    }

    public DriveLicense() {

    }
}
