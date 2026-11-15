.class final LH5/E$a;
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


# static fields
.field public static final m:LH5/E$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LH5/E$a;

    .line 2
    .line 3
    invoke-direct {v0}, LH5/E$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH5/E$a;->m:LH5/E$a;

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
    invoke-virtual {p0, p1, p2}, LH5/E$a;->a(Lm5/g;Lm5/g$b;)Lm5/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
