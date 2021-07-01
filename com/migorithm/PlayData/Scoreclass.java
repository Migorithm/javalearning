package com.migorithm.PlayData;

public class Scoreclass {
    private int kor;
    private int eng;
    private int mat;

    public Scoreclass() {
        super();
    }
    public Scoreclass(int kor, int eng, int mat) {
        super();
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return getKor() + getEng() + getMat();
    }

    public double getAvg() {
        return (double) getTot()/3;
    }

    public String getGrade() {
        String grade =null;
        switch ((int)getAvg()/10) { //98.0 -> 9.8 -> 9. 100 -> 10.0 -> 10
            case 10: case 9: grade = "A" ; break;
            case 8 : grade = "B"; break;
            case 7 : grade = "C"; break;
            case 6 : grade = "D"; break;
            default: grade = "F";
        }
        return grade;
    }
    @Override
    public String toString() {
        String str = String.format("국어:%5d\n영어:%5d\n수학:%5d\n총점:%5d\n평균:%5.1f\n학점:%5s\n", this.getKor(),this.getEng(),this.getMat(),
                this.getTot(), this.getAvg(), this.getGrade());
        return str;
    }
    public static void main(String[] args) {

//		Score[] sm = new Score[3];   // 사이즈 지정
//		sm[0] = new Score(90,80,50);
//		sm[1] = new Score(100,43,22);
//		sm[2] = new Score(68,66,33);

        Scoreclass[] sm = new Scoreclass[] { new Scoreclass(90,80,50),new Scoreclass(100,43,22), new Scoreclass(68,66,33)};
        for (Scoreclass res : sm) {
            System.out.println(res);
        }

    }
}


