.class public final LE5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/d;


# instance fields
.field private final a:LE5/d;

.field private final b:Lv5/l;


# direct methods
.method public constructor <init>(LE5/d;Lv5/l;)V
    .locals 1

    .line 1
    const-string v0, "sequence"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transformer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LE5/k;->a:LE5/d;

    .line 15
    .line 16
    iput-object p2, p0, LE5/k;->b:Lv5/l;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic b(LE5/k;)LE5/d;
    .locals 0

    .line 1
    iget-object p0, p0, LE5/k;->a:LE5/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(LE5/k;)Lv5/l;
    .locals 0

    .line 1
    iget-object p0, p0, LE5/k;->b:Lv5/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LE5/k$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE5/k$a;-><init>(LE5/k;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
