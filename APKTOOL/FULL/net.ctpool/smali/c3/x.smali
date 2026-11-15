.class public final synthetic Lc3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/M$b;


# instance fields
.field public final synthetic a:Lc3/M;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LU2/p;


# direct methods
.method public synthetic constructor <init>(Lc3/M;Ljava/util/List;LU2/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/x;->a:Lc3/M;

    iput-object p2, p0, Lc3/x;->b:Ljava/util/List;

    iput-object p3, p0, Lc3/x;->c:LU2/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc3/x;->a:Lc3/M;

    iget-object v1, p0, Lc3/x;->b:Ljava/util/List;

    iget-object v2, p0, Lc3/x;->c:LU2/p;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lc3/M;->R0(Lc3/M;Ljava/util/List;LU2/p;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
