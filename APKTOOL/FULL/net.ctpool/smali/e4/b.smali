.class public final synthetic Le4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/a$a;


# instance fields
.field public final synthetic a:Le4/d;


# direct methods
.method public synthetic constructor <init>(Le4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/b;->a:Le4/d;

    return-void
.end method


# virtual methods
.method public final a(LD4/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le4/b;->a:Le4/d;

    invoke-static {v0, p1}, Le4/d;->f(Le4/d;LD4/b;)V

    return-void
.end method
