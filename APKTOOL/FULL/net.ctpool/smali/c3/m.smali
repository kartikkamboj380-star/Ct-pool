.class public final synthetic Lc3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/M$b;


# instance fields
.field public final synthetic a:Lc3/M;

.field public final synthetic b:LU2/p;


# direct methods
.method public synthetic constructor <init>(Lc3/M;LU2/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/m;->a:Lc3/M;

    iput-object p2, p0, Lc3/m;->b:LU2/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc3/m;->a:Lc3/M;

    iget-object v1, p0, Lc3/m;->b:LU2/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lc3/M;->g(Lc3/M;LU2/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
