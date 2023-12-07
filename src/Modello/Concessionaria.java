package Modello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Concessionaria {
	private List <Automobile> magazzino = new ArrayList<>();
	
	
	
	public void addAuto(Automobile auto) {
		magazzino.add(auto);
	}
	
	public void remouvAuto(Automobile auto) {
		magazzino.remove(auto);
	}
	
	public void resoconto() {
		System.out.println(magazzino);
	}
	
	public double sommaAuto() {
		double somma = 0.0;
		for(Automobile a :magazzino) {
			somma += a.getPrezzo();
		}
		return somma;
	}
	

	public Concessionaria(List<Automobile> magazzino) {
		this.magazzino = magazzino;
	}
	
	public Concessionaria() {
		
	}

	public List<Automobile> getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(List<Automobile> magazzino) {
		this.magazzino = magazzino;
	}

	
	public String casaProduttricePiuFrequente() {
        Map<String, Integer> conteggioCasaProd = new HashMap<>();

        for (Automobile auto : magazzino) {
            String casaProd = auto.getCasaProdutrice();
            conteggioCasaProd.put(casaProd, conteggioCasaProd.getOrDefault(casaProd, 0) + 1);
        }

        String casaProduttricePiuFrequente = null;
        int maxFrequenza = 0;

        for (Map.Entry<String, Integer> entry : conteggioCasaProd.entrySet()) {
            if (entry.getValue() > maxFrequenza) {
                casaProduttricePiuFrequente = entry.getKey();
                maxFrequenza = entry.getValue();
            }
        }

        return casaProduttricePiuFrequente;
    }

	
	
	public Automobile findAutoPiuBassaWithPrezzo() {
	    Automobile autoCilindrataMinima = null;
	    double prezzoMinimo = Double.MAX_VALUE;

	    for (Automobile auto : magazzino) {
	        if (auto.getPrezzo() < prezzoMinimo && auto.getPrezzo() < 10000) {
	            prezzoMinimo = auto.getPrezzo();
	            autoCilindrataMinima = auto;
	        }
	    }
	    return autoCilindrataMinima;
	}
	
	public Automobile findAutoCilindrataAltaPrezzoSuperioreAllaMedia() {
	    double somma = 0;
	    for (Automobile auto : magazzino) {
	        somma += auto.getPrezzo();
	    }
	    double prezzoMedio = somma / magazzino.size();

	    Automobile autoCilindrataMassima = null;
	    double cilindrataMassima = Double.MIN_VALUE;

	    for (Automobile a : magazzino) {
	        if (a.getPrezzo() >= prezzoMedio && a.getCilindrata() > cilindrataMassima) {
	            cilindrataMassima = a.getCilindrata();
	            autoCilindrataMassima = a;
	        }
	    }
	    return autoCilindrataMassima;
	}

	
	
	public List<Automobile> findCaseProduttriciaAutoPrezzoInferioreAllaMedia(){
	    List<Automobile> listaAuto = new ArrayList<>();
	    double somma = 0;
	    
	    for (Automobile auto : magazzino) {
	        somma += auto.getPrezzo();
	    }
	    
	    double prezzoMedio = somma / magazzino.size();

	    for (Automobile auto : magazzino) {
	        if (auto.getPrezzo() < prezzoMedio) {
	            listaAuto.add(auto);
	        }
	    }
	    
	    return listaAuto;
	}

	
	
	public void findCaseProduttriciAutoStessaCilindrata() {
	    Map<String, ArrayList<Double>> map = new HashMap<>();

	    for (Automobile auto : magazzino) {
	        String casaProduttrice = auto.getCasaProdutrice();
	        double cilindrata = auto.getCilindrata();

	        if (!map.containsKey(casaProduttrice)) {
	            map.put(casaProduttrice, new ArrayList<>(List.of(cilindrata)));
	        } else {
	            ArrayList<Double> cilindrate = map.get(casaProduttrice);
	            cilindrate.add(cilindrata);
	            map.put(casaProduttrice, cilindrate);
	        }
	    }

	    for (String key : map.keySet()) {
	        ArrayList<Double> listaValori = map.get(key);
	        Set<Double> set = new HashSet<>();

	        for (double numero : listaValori) {
	            if (set.contains(numero)) {
	                System.out.println(key);
	                break; // Stampa solo una volta la casa produttrice
	            }
	            set.add(numero);
	        }
	    }
	}

	

	
	@Override
	public String toString() {
		return "Concessionaria [magazzino=" + magazzino + "]";
	}
	
}
