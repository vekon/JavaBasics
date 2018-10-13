public class AbstractEnums {
    public static void main(String[] args) {
        System.out.println("Vehicle is "+Vehicles.CAR+" and no. of wheels are "+Vehicles.CAR.getWheels());
        System.out.println("Vehicle is "+Vehicles.TRUCK+" and no. of wheels are "+Vehicles.TRUCK.getWheels());
        System.out.println("Vehicle is "+Vehicles.BIKE+" and no. of wheels are "+Vehicles.BIKE.getWheels());
    }
}

enum Vehicles {
    CAR {
        @Override
        public int getWheels() {
            return 4;
        }

    },
    TRUCK {
        @Override
        public int getWheels() {
            return 8;
        }

    },
    BIKE {
        @Override
        public int getWheels() {
            return 2;
        }

    };
    public abstract int getWheels();
}

