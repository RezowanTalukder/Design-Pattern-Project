
package project;

/**
 *
 * @author rez1
 */
public class OrientalCountry implements ICountry{

    @Override
    public IFlora createFlora() {
        IFlora ori = new OrientalFlora() ;
        return ori ;
    }

    @Override
    public IFoana createFoana() {
        IFoana or = new OrientalFoana() ;
        return or ;
    }
    
    
}
