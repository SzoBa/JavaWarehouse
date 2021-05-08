package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Payable;

/** Order gyermekosztály, a beszállítói rendelések reprezentálására */
/** Order child class, to represent supplier orders */
public class SupplierOrder extends Order{

    public SupplierOrder(int orderId) {
        super(orderId);
    }

    /** Olyan Payable-t készít, amit nekünk kell fizetni (negatív értékű) */
    /** Creates a Payable that we have to pay (negative value) */
    @Override
    Payable createPayable() {
        return null;
    }

    /** StockItem hozzáadása a Storage-okhoz. Beszállítói rendelésnél ez bevételezésnek felel meg. */
    /** Add StockItems to Storages. In the case of a supplier order, this corresponds to stockpiling. */
    @Override
    void updateStock() {

    }


}
