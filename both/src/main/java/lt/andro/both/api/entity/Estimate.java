package lt.andro.both.api.entity;


/**
 * @author Vilius Kraujutis
 * @since 2014-10-25 13:40
 */
public class Estimate extends BaseEntity {
    public Provider provider;
    public Destination destination;
    public Double price;
    public int travelTime;
    public int distance;
}
