/**
 * File      : Titik.java		21/02/24
 * Nama penulis   : Baron Albana Achmad
 * NIM               : 24060122130073
 * Deskripsi : Class yang berisi main dari Titik
 * 
 */
class Titik
{
	double absis, ordinat;
	static double counterTitik;
  
//constructor
	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	void setAbsis(double abs)
	{
		absis=abs;
	}
	
	double getAbsis()
	{
		return absis;
	}

	void setOrdinat(double ord)
	{
		ordinat=ord;
	}

	double getOrdinat()
	{
		return ordinat;
	}

	double getCounterTitik()
	{
		return counterTitik;
	}	

	Titik(double abs, double ord)
	{
		absis = abs;
		ordinat = ord;
		counterTitik++;
	}

}
