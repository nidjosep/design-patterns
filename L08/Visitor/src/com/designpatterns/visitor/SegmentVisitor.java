package com.designpatterns.visitor;

public interface SegmentVisitor {
    void visit(FactSegment factSegment);
    void visit(FormatSegment formatSegment);
}