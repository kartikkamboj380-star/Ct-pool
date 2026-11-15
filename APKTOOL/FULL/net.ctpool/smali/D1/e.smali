.class public interface abstract LD1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD1/c;


# direct methods
.method public static P0(Landroid/graphics/Bitmap;LS0/g;LD1/l;II)LD1/e;
    .locals 7

    .line 1
    invoke-static {}, LD1/b;->j0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LD1/b;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    move-object v2, p0

    .line 11
    move-object v3, p1

    .line 12
    move-object v4, p2

    .line 13
    move v5, p3

    .line 14
    move v6, p4

    .line 15
    invoke-direct/range {v1 .. v6}, LD1/b;-><init>(Landroid/graphics/Bitmap;LS0/g;LD1/l;II)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, LD1/f;

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    move-object v2, p0

    .line 23
    move-object v3, p1

    .line 24
    move-object v4, p2

    .line 25
    move v5, p3

    .line 26
    move v6, p4

    .line 27
    invoke-direct/range {v1 .. v6}, LD1/f;-><init>(Landroid/graphics/Bitmap;LS0/g;LD1/l;II)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static Q0(LS0/a;LD1/l;II)LD1/e;
    .locals 1

    .line 1
    invoke-static {}, LD1/b;->j0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LD1/b;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2, p3}, LD1/b;-><init>(LS0/a;LD1/l;II)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v0, LD1/f;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1, p2, p3}, LD1/f;-><init>(LS0/a;LD1/l;II)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static y(Landroid/graphics/Bitmap;LS0/g;LD1/l;I)LD1/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, p3, v0}, LD1/e;->P0(Landroid/graphics/Bitmap;LS0/g;LD1/l;II)LD1/e;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method


# virtual methods
.method public abstract T()I
.end method

.method public abstract g1()I
.end method
