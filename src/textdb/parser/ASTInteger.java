/* Generated By:JJTree: Do not edit this line. ASTInteger.java */
package textdb.parser;

public class ASTInteger extends SimpleNode {
  public ASTInteger(int id) {
    super(id);
  }

  public ASTInteger(SimpleParser p, int id) {
    super(p, id);
  }

  public void setName(String n) {
    name = n;
  }

  public String toString() {
    return "Integer: "+name;
  }

  private String name;

}
