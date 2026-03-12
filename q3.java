class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

      void GetCar(int id, String type){
        CarId = id;
        CarType = type;
      }

    public float getRent() {
        if(CarType.equalsIgnoreCase("Samll car")){
        return 1000;
    }
    else if(CarType.equalsIgnoreCase("Van")){
        return 8000;
    }
    else if(CarType.equalsIgnoreCase("Suv")){
        return 25000;
    }
    else{
        return 0;
    }
     
 
    }
    void ShowCar(){
        Rent = getRent();
        System.out.println("Car Id: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}
public class q3 {

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(191,"Small Car");
        c.ShowCar();
        c.GetCar(199,"Suv");
        c.ShowCar();
        
    }
}

// Define a class CARRENTAL with the following details:
//  Class Members are: CarId of int type, CarType of string type and Rent of
// float type.
//  Define GetCar() method which accepts CarId and CarType.
//  GetRent() method which return rent of the car on the basis of car type, i.e.
// Small Car = 1000, Van = 800, SUV = 2500
//  ShowCar() method which allow user to view the contents of cars i.e. id, type
// and rent.
