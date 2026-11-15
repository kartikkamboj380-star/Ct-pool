.class public final synthetic Lc3/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/M$b;


# instance fields
.field public final synthetic a:Lc3/M;

.field public final synthetic b:LU2/i;

.field public final synthetic c:LU2/p;


# direct methods
.method public synthetic constructor <init>(Lc3/M;LU2/i;LU2/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/I;->a:Lc3/M;

    iput-object p2, p0, Lc3/I;->b:LU2/i;

    iput-object p3, p0, Lc3/I;->c:LU2/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc3/I;->a:Lc3/M;

    iget-object v1, p0, Lc3/I;->b:LU2/i;

    iget-object v2, p0, Lc3/I;->c:LU2/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lc3/M;->h0(Lc3/M;LU2/i;LU2/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
