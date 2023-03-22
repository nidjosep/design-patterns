package com.designpatterns.visitor;

public class ReverbFilterVisitor implements SegmentVisitor {
    @Override
    public void visit(FactSegment factSegment) {
        System.out.println("Applying reverb filter on " + factSegment.getClass().getSimpleName());
    }

    @Override
    public void visit(FormatSegment formatSegment) {
        System.out.println("Applying reverb filter on " + formatSegment.getClass().getSimpleName());
    }
}