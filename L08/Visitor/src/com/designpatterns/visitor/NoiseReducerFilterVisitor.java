package com.designpatterns.visitor;

public class NoiseReducerFilterVisitor implements SegmentVisitor {
    @Override
    public void visit(FactSegment factSegment) {
        System.out.println("Applying noise reduce filter on " + factSegment.getClass().getSimpleName());
    }

    @Override
    public void visit(FormatSegment formatSegment) {
        System.out.println("Applying noise reduce filter on " + formatSegment.getClass().getSimpleName());
    }
}