/* Generated By:JJTree: Do not edit this line. ASTReal.java */
package textdb.parser;

public class ASTReal extends SimpleNode {
  public ASTReal(int id) {
    super(id);
  }

  public ASTReal(SimpleParser p, int id) {
    super(p, id);
  }

  public void setName(String n) {
    name = n;
  }

  public String toString() {
    return "Real: "+name;
  }

  private String name;

}
