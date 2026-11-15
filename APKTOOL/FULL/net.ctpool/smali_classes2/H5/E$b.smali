.class final LH5/E$b;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH5/E;->a(Lm5/g;Lm5/g;Z)Lm5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Lw5/v;

.field final synthetic n:Z


# direct methods
.method constructor <init>(Lw5/v;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LH5/E$b;->m:Lw5/v;

    .line 2
    .line 3
    iput-boolean p2, p0, LH5/E$b;->n:Z

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lm5/g;Lm5/g$b;)Lm5/g;
    .locals 0

    .line 1
    invoke-interface {p1, p2}, Lm5/g;->o(Lm5/g;)Lm5/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm5/g;

    .line 2
    .line 3
    check-cast p2, Lm5/g$b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LH5/E$b;->a(Lm5/g;Lm5/g$b;)Lm5/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
