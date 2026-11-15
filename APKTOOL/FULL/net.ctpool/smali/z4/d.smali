.class public interface abstract annotation Lz4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lz4/d;
        intEncoding = .enum Lz4/d$a;->m:Lz4/d$a;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/d$a;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()Lz4/d$a;
.end method

.method public abstract tag()I
.end method
