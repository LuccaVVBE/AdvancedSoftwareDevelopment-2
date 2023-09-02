package domein;

public class ExternalTask extends Task {


    public ExternalTask(String name, String description, double taskTimeRequired, double rate) {
        super(name, description, taskTimeRequired, rate);
    }

   @Override
   public boolean includeVAT() {
	   return true;
   }

}
