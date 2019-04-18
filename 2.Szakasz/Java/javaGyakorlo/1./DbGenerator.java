public class DbGenerator {

  public static void main(String[] args) {
    System.out.println(
      String.format("Az en nevem: %s, korom: %s, anyam neve: %s",
      "Peti", "12", "Geza")
      );

    String[] names = {"Feri", "Kata", "Tasi", "Gyorgyi"};
    for(String name: names) {
      System.out.println(
          String.format("Kedvenc pajtasom: %s", name)
      );
    }

    String[] roles = {"admin", "user", "dementor", "feri", "Tasi", "konszuela"};
    for(String role: roles) {
      System.out.println(
          String.format("INSERT INTO roles (name) VALUES ('%s');", role)
      ); 
    }

    int FIX_VALUE = 9;
    String[] email = {
      "mari@spam4.me", "juli@spam4.me", "tomi@spam4.me", "feri@spam4.me", "tibi@spam4.me",
      "tiiiiiiii@spam4.me", "tkkkkkkk@spam4.me", "tbbbbbb@spam4.me", "thleelooo@spam4.me", "tlololol@spam4.me"};

    String[] fullname = {
      "Kovacs Rihanna", "Armando", "Bela Toth", "Istvan Pista", "Geza Bela", "Kata",
      "Feriferi", "Tibor", "ASD", "hello"
    };

    System.out.println(Math.round((Math.random() * FIX_VALUE) + 1));

    for(int i = 0; i < FIX_VALUE; i++) {
      int random1 = (int)Math.round((Math.random() * FIX_VALUE));
      int random2 = (int)Math.round((Math.random() * FIX_VALUE));
      System.out.println(
          String.format("INSERT INTO users (email, fullname, password) VALUES ('%s', '%s', '%s');",
          email[random1], fullname[random2], getRandomPassword()
          )
      );
    }
  }
  public static String getRandomPassword() {
    return "";
  }

  public static String getRandomRoleId() {
    return "1";
  }
}