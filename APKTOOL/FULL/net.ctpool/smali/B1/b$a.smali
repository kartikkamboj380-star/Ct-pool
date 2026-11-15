.class LB1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB1/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LB1/b;


# direct methods
.method constructor <init>(LB1/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB1/b$a;->a:LB1/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LD1/g;ILD1/l;Lx1/c;)LD1/d;
    .locals 8

    .line 1
    invoke-virtual {p1}, LD1/g;->n()Ls1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LB1/b$a;->a:LB1/b;

    .line 6
    .line 7
    invoke-static {v1}, LB1/b;->b(LB1/b;)LO0/o;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, LO0/o;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p4, Lx1/c;->k:Landroid/graphics/ColorSpace;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, LD1/g;->j()Landroid/graphics/ColorSpace;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_0
    :goto_0
    move-object v7, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v1, p4, Lx1/c;->k:Landroid/graphics/ColorSpace;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    sget-object v1, Ls1/b;->b:Ls1/c;

    .line 37
    .line 38
    if-ne v0, v1, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, LB1/b$a;->a:LB1/b;

    .line 41
    .line 42
    move-object v3, p1

    .line 43
    move v4, p2

    .line 44
    move-object v5, p3

    .line 45
    move-object v6, p4

    .line 46
    invoke-virtual/range {v2 .. v7}, LB1/b;->e(LD1/g;ILD1/l;Lx1/c;Landroid/graphics/ColorSpace;)LD1/e;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_2
    sget-object v1, Ls1/b;->d:Ls1/c;

    .line 52
    .line 53
    if-ne v0, v1, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, LB1/b$a;->a:LB1/b;

    .line 56
    .line 57
    invoke-virtual {v0, p1, p2, p3, p4}, LB1/b;->d(LD1/g;ILD1/l;Lx1/c;)LD1/d;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_3
    sget-object v1, Ls1/b;->k:Ls1/c;

    .line 63
    .line 64
    if-ne v0, v1, :cond_4

    .line 65
    .line 66
    iget-object v0, p0, LB1/b$a;->a:LB1/b;

    .line 67
    .line 68
    invoke-virtual {v0, p1, p2, p3, p4}, LB1/b;->c(LD1/g;ILD1/l;Lx1/c;)LD1/d;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_4
    sget-object p2, Ls1/c;->d:Ls1/c;

    .line 74
    .line 75
    if-eq v0, p2, :cond_5

    .line 76
    .line 77
    iget-object p2, p0, LB1/b$a;->a:LB1/b;

    .line 78
    .line 79
    invoke-virtual {p2, p1, p4}, LB1/b;->f(LD1/g;Lx1/c;)LD1/e;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_5
    new-instance p2, LB1/a;

    .line 85
    .line 86
    const-string p3, "unknown image format"

    .line 87
    .line 88
    invoke-direct {p2, p3, p1}, LB1/a;-><init>(Ljava/lang/String;LD1/g;)V

    .line 89
    .line 90
    .line 91
    throw p2
.end method
