package entity;

public class Bill {

   private char gender;
   private int beer;
   private int barbecue;
   private int softDrink;

   public void setGender(char gender) {
      this.gender = gender;
   }

   public void setBeer(int beer) {
      this.beer = beer;
   }

   public void setBarbecue(int barbecue) {
      this.barbecue = barbecue;
   }

   public void setSoftDrink(int softDrink) {
      this.softDrink = softDrink;
   }

   public double cover() {
      return feeding() > 30.00 ? 0.00 : 4.00;
   }

   public double feeding() {
      return beer * 5.00 + softDrink * 3.00 + barbecue * 7.00;
   }

   public double ticket() {
      return gender == 'F' ? 8.00 : 10.00;
   }

   public double total() {
      return cover() + feeding() + ticket();
   }
}
