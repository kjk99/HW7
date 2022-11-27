package de.uni.koeln.sse.se;

public interface Visitor {
    public String visit(Electronic electronic);
    public String visit(Glass glass);
    public String visit(Furniture furniture);
}
