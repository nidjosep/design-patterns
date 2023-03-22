package com.designpatterns.visitor;

public class NormalizeFilterVisitor implements SegmentVisitor {
    @Override
    public void visit(FactSegment factSegment) {
        System.out.println("Applying normalize on " + factSegment.getClass().getSimpleName());
    }

    @Override
    public void visit(FormatSegment formatSegment) {
        System.out.println("Applying normalize on " + formatSegment.getClass().getSimpleName());
    }
}