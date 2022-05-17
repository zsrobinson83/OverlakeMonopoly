public class BoardSpace {
    private int location;
    private int value;
    private int houses;
    private int hotels;
    private int tax; 
    private String type;
    private boolean owned = false;
//We can deterimne which side of the board it is on by dividing it by 4.
    public BoardSpace(int location,int value,int houses,int hotels, int tax, String type){
        this.location = location;
        this.value = value;
        this.houses = houses;
        this.hotels = hotels;
        this.tax = tax;
        this.type = type;
    } 
}
