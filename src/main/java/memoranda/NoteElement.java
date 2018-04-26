package main.java.memoranda;

import nu.xom.Element;
//TASK 2-2 SMELL BETWEEN CLASSES
//Result of extracting the nested classes.
public class NoteElement {
  Element nEl;
  
  public NoteElement(Element el) {
      nEl = el;
  }
  
  public Element getElement() {
      return nEl;
  }
}
