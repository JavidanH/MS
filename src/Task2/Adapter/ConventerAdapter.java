package Task2.Adapter;

public class ConventerAdapter implements EXCEL {

    private XML xmlAdapter;

    public ConventerAdapter (XML xmlAdapter){
        this.xmlAdapter=xmlAdapter;
    }
    @Override
    public void writeToExcel(String data) {

    }


}
