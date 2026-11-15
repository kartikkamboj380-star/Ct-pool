.class final Landroidx/room/d$a$e;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/d$a;->N0()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:Landroidx/room/d$a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/room/d$a$e;

    invoke-direct {v0}, Landroidx/room/d$a$e;-><init>()V

    sput-object v0, Landroidx/room/d$a$e;->m:Landroidx/room/d$a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LZ/g;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LZ/g;->N0()Z

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

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LZ/g;

    invoke-virtual {p0, p1}, Landroidx/room/d$a$e;->a(LZ/g;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
