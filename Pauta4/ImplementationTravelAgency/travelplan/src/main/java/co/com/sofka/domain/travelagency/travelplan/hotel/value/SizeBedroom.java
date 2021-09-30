package co.com.sofka.domain.travelagency.travelplan.hotel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SizeBedroom implements ValueObject<Float> {

    private final Float value;

    public SizeBedroom(Float value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 0){
            new IllegalArgumentException("The number of beds cannot be less than 0");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SizeBedroom that = (SizeBedroom) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Float value() {
        return value;
    }
}
