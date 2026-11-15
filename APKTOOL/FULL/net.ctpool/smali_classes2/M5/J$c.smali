.class final LM5/J$c;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM5/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:LM5/J$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LM5/J$c;

    .line 2
    .line 3
    invoke-direct {v0}, LM5/J$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LM5/J$c;->m:LM5/J$c;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a(LM5/N;Lm5/g$b;)LM5/N;
    .locals 1

    .line 1
    instance-of v0, p2, LH5/K0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, LH5/K0;

    .line 6
    .line 7
    iget-object v0, p1, LM5/N;->a:Lm5/g;

    .line 8
    .line 9
    invoke-interface {p2, v0}, LH5/K0;->H0(Lm5/g;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, p2, v0}, LM5/N;->a(LH5/K0;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/N;

    .line 2
    .line 3
    check-cast p2, Lm5/g$b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LM5/J$c;->a(LM5/N;Lm5/g$b;)LM5/N;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
