package com.migorithm.PlayData;

public class Haversine {
    private int R = 6371000;
    public double meters;
    public double km;



    public Haversine(double[] coord1,double[] coord2){
        double lon1 = coord1[0];
        double lat1 = coord1[1];
        double lon2 = coord2[0];
        double lat2 = coord2[1];
        double phi_1 = Math.toRadians(lat1);
        double phi_2 = Math.toRadians(lat2);
        double delta_phi=Math.toRadians(lat2-lat1);
        double delta_lambda = Math.toRadians(lon2-lon1);
        double a = Math.pow(Math.sin(delta_phi/2.0),2)+ Math.cos(phi_1)*Math.cos(phi_2)*Math.pow(Math.sin(delta_lambda/2),2);
        double c = 2*Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        this.meters = R*c;
        this.km = this.meters/1000;
    }

    public static void main(String[] args) {
        double [] coord1 = {37.489644925809976, 126.78133220838266};
        double [] coord2 = {37.559956340399864, 126.94232347396871};
        Haversine dis1 = new Haversine(coord1,coord2);
        System.out.println(dis1.km);
    }
}
