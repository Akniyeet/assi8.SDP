import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor() {
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item: Price with Tax");
        String formattedPrice = df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice());
        return Double.parseDouble(formattedPrice.replace(",", "."));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item: Price with Tax");
        String formattedPrice = df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice());
        return Double.parseDouble(formattedPrice.replace(",", "."));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity item: Price with Tax");
        String formattedPrice = df.format((necessityItem.getPrice() * 0) + necessityItem.getPrice());
        return Double.parseDouble(formattedPrice.replace(",", "."));
    }
}
