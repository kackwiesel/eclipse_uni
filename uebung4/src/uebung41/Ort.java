package uebung41;

public class Ort<E> {
	
	private E eingelagertesElem;
	private final int ortsId;
	
	public Ort(int ortsId){
		this.ortsId = ortsId;
	}
	
	public boolean istBelegt(){
		return (eingelagertesElem == null ? true : false);
	}
	
	public E entnehmen(){
		E e = eingelagertesElem;
		eingelagertesElem = null;
		return e;
	}
	
	public void hinzufuegen(E e){
		if(!istBelegt()){
			eingelagertesElem = e;
		}
	}
	
	public E getEingelagertesElem(){
		E e = eingelagertesElem;
		return e;
	}
	
	public int getOrtsId(){
		return ortsId;
	}
	
	@Override
	public String toString(){
		return ortsId +": " + eingelagertesElem;
	}

}
