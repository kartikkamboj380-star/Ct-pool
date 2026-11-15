.class final synthetic Landroidx/room/d$a$d;
.super Lw5/i;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/d$a;->I0()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final v:Landroidx/room/d$a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/room/d$a$d;

    invoke-direct {v0}, Landroidx/room/d$a$d;-><init>()V

    sput-object v0, Landroidx/room/d$a$d;->v:Landroidx/room/d$a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "inTransaction()Z"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, LZ/g;

    const-string v3, "inTransaction"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lw5/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LZ/g;

    invoke-virtual {p0, p1}, Landroidx/room/d$a$d;->l(LZ/g;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final l(LZ/g;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const-string v0, "p0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LZ/g;->I0()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
