.class public final Lx1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/f$a;
    }
.end annotation


# static fields
.field public static final e:Lx1/f$a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:F

.field public final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx1/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lx1/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx1/f;->e:Lx1/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(II)V
    .locals 7

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 1
    invoke-direct/range {v0 .. v6}, Lx1/f;-><init>(IIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIFF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx1/f;->a:I

    iput p2, p0, Lx1/f;->b:I

    iput p3, p0, Lx1/f;->c:F

    iput p4, p0, Lx1/f;->d:F

    const-string p3, "Check failed."

    if-lez p1, :cond_1

    if-lez p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(IIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/high16 p3, 0x45000000    # 2048.0f

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const p4, 0x3f2aaaab

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lx1/f;-><init>(IIFF)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lx1/f;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget v1, p0, Lx1/f;->a:I

    .line 10
    .line 11
    check-cast p1, Lx1/f;

    .line 12
    .line 13
    iget v2, p1, Lx1/f;->a:I

    .line 14
    .line 15
    if-ne v1, v2, :cond_1

    .line 16
    .line 17
    iget v1, p0, Lx1/f;->b:I

    .line 18
    .line 19
    iget p1, p1, Lx1/f;->b:I

    .line 20
    .line 21
    if-ne v1, p1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lx1/f;->a:I

    .line 2
    .line 3
    iget v1, p0, Lx1/f;->b:I

    .line 4
    .line 5
    invoke-static {v0, v1}, LW0/b;->a(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lw5/y;->a:Lw5/y;

    .line 2
    .line 3
    iget v0, p0, Lx1/f;->a:I

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, p0, Lx1/f;->b:I

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    const-string v2, "%dx%d"

    .line 26
    .line 27
    invoke-static {v1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "format(locale, format, *args)"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method
