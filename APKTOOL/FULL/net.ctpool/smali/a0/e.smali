.class public final synthetic La0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:LZ/h$a;

.field public final synthetic b:La0/d$b;


# direct methods
.method public synthetic constructor <init>(LZ/h$a;La0/d$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/e;->a:LZ/h$a;

    iput-object p2, p0, La0/e;->b:La0/d$b;

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 1
    iget-object v0, p0, La0/e;->a:LZ/h$a;

    iget-object v1, p0, La0/e;->b:La0/d$b;

    invoke-static {v0, v1, p1}, La0/d$c;->a(LZ/h$a;La0/d$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
